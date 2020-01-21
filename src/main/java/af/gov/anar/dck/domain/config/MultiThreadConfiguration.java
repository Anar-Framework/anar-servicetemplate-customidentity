/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af.gov.anar.dck.domain.config;

import af.gov.anar.dck.domain.util.ParamConstant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 *
 * @author hp 2018
 */
@Configuration
public class MultiThreadConfiguration {

    @Bean
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(ParamConstant.ADAPTER_CORE_POOLING_SIZE);
        executor.setMaxPoolSize(ParamConstant.ADAPTER_MAX_POOLING_SIZE);
        executor.setQueueCapacity(ParamConstant.ADAPTER_QUEUE_CAPACITY);
        executor.setThreadNamePrefix(ParamConstant.ADAPTER_DEFAULT_PREFIX);
        executor.initialize();
        return executor;
    }
}
