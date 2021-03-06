/*
*
* Copyright 2013 Netflix, Inc.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
*/
package com.netflix.loadbalancer;


/**
 * Class that is responsible to Filter out list of servers from the ones 
 * currently available in the Load Balancer
 *
 * 从负载均衡器LoadBalancer的服务器列表里面筛选出可用的Server，它无非就是规定了Server来源：来自于负载均衡器LB，
 * 这种可用/不可用是通过指标收集库/存储库LoadBalancerStats计算出来的
 *
 * @author stonse
 *
 * @param <T>
 */
public abstract class AbstractServerListFilter<T extends Server> implements ServerListFilter<T> {

    private volatile LoadBalancerStats stats;
    
    public void setLoadBalancerStats(LoadBalancerStats stats) {
        this.stats = stats;
    }
    
    public LoadBalancerStats getLoadBalancerStats() {
        return stats;
    }

}
