package af.gov.anar.dck.common.util.websocket;

import af.gov.anar.dck.common.util.ParamConstant;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint(ParamConstant.WEBSCOKET_ENDPOINT).setAllowedOrigins(ParamConstant.WEBSOCKET_ALLOWED_ORIGINS)
                .withSockJS();;
    }
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker(ParamConstant.NOTITICATIONS_DESTINATION_PREFIXES);
    }
}