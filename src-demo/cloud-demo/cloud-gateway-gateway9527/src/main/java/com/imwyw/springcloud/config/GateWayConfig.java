package com.imwyw.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangyuanwei
 * @title: GateWayConfig
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/14 8:55
 */
@Configuration
public class GateWayConfig {

    /**
     * 配置 id 为 path_route_baidu_guonei 的路由规则
     * 当访问 localhost:xxxx/guonei 时自动转发至 http://news.baidu.com/guonei
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_baidu_guonei",
                r -> r.path("/guonei").uri("http://news.baidu.com/guonei")
        ).build();

        return routes.build();
    }

}
