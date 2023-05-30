//package org.example.loadbalanced;
//
//import org.springframework.cloud.client.ServiceInstance;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.env.Environment;
//
//public class CustomlLoadBalancedConffiguration {
//
//    @Bean
//    ReactorLoadBalancer<ServiceInstance> randomLoadBalancer(Environment environment, LoadBalancerClientFactory loadBalancerClientFactory){
//        String name = environment.getProperty(LoadBalancerClientFactory.PROPERTY_NAME);
//        ReactorLoadBalancer reactorLoadBalancer = new RandomLoadBalancer(loadBalancerClientFactory.getLazyProvider(name, ServiceInstanceListSupplier.class),name);
//        return reactorLoadBalancer;
//    }
//}
