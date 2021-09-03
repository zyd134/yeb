package com.zhang.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * WebSocket配置类
 * @author thinkpad
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    /**
     * 添加这个Endpoint,这样在网页可以通过websocket连接上服务
     * 也就是我们配置websocket的服务地址，并且可以指定是否使用socketJS
     * @param registry
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        /**
         * 1、将ws/ep路径注册为stomp的端点，用户连接看这个端点就可以进行websocket通讯，支持socketJS
         * 2、setAllowedOrigins(*)：允许跨域
         * 3、withSockJS():支持socketJs访问
         */
        registry.addEndpoint("/ws/ep").setAllowedOrigins("*").withSockJS();
    }

    @Override
    public void configureClientInboundChannel(ChannelRegistration registration) {

    }

    /**
     * 配置消息代理
     * @param registry
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //配置代理，可以配置多个，
        registry.enableSimpleBroker("/queue");
    }
}
