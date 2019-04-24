package io.github.wangmeng.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


/**
* SpringCloud-GateWay filter 全局filter
* @author RedWall
* @mail walkmanlucas@gmail.com
* @date 2019/3/28
* @since JDK 1.8
**/
public class AuthorizeGatewayFilter implements GlobalFilter,Ordered {



    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest serverHttpRequest = exchange.getRequest();

        // TODO 需要过滤的条件
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
