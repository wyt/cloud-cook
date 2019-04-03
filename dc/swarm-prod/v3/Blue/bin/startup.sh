#!/usr/bin/env bash
#Author: WANG YONG TAO

echo "First arg: $1"
echo "Second arg: $2"
echo "Third arg: $3"
echo "Fourth arg: $4"

# 镜像版本号
export IMAGE_VER=$1
# spring profile 环境
export SPRING_PROFILES_ACTIVE=$2
# logstash地址
export FILEBEAT_OP_LS_HOSTS=$3
# EUREKA高可用地址列表
export CLUSTERS_EUREKA_SERVER_URLS=http://eureka-server:7777/eureka/,http://eureka-server-2:7777/eureka/

# 工程模块，dlink-ops-infrastructure=INFRA;dlink-ops-platform=PLATFORM;dlink-ops-application=APPS;
export PROJECT_MOUDLE=$4

echo "${PROJECT_MOUDLE} ${IMAGE_VER} ${SPRING_PROFILES_ACTIVE} ${FILEBEAT_OP_LS_HOSTS}"

if [ -n "${IMAGE_VER}" ] && [ -n "${SPRING_PROFILES_ACTIVE}" ] && [ -n "${FILEBEAT_OP_LS_HOSTS}" ] && [ -n "${PROJECT_MOUDLE}" ] ; then
    cd /winchannel/dlink-docker-compose/dlink-ops-platform/swarm-prod/v3/Blue
    pwd
    # 启动dop服务栈
    if [ "${PROJECT_MOUDLE}" = "INFRA" ]; then
	    echo "dop infra service executing"
	    export INFRA_IMAGE_VER=${IMAGE_VER}
	    echo "INFRA_IMAGE_VER ${INFRA_IMAGE_VER}"
        docker stack deploy -c dlink-ops-infrastructure.yml --with-registry-auth dop-infra_blue
    fi
    if [ "${PROJECT_MOUDLE}" = "PLATFORM" ]; then
	    echo "dop platform service executing"
	    export PLATFORM_IMAGE_VER=${IMAGE_VER}
	    echo "PLATFORM_IMAGE_VER ${PLATFORM_IMAGE_VER}"
        docker stack deploy -c dlink-ops-platform.yml --with-registry-auth dop-platform_blue
    fi
    if [ "${PROJECT_MOUDLE}" = "APPS" ]; then
	    echo "dop apps service executing"
	    export APP_IMAGE_VER=${IMAGE_VER}
	    echo "APP_IMAGE_VER ${APP_IMAGE_VER}"
        docker stack deploy -c dlink-ops-application.yml --with-registry-auth dop-apps_blue
    fi
    # 查看服务列表
    docker service ls
    # 服务列表详情
    docker service ps $(docker service ls -q)
else
    echo "Parameter is empty!"
fi