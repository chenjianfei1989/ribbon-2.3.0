package com.netflix.loadbalancer;

/**
 * Defines the strategy, used to ping all servers, registered in
 * <b>com.netflix.loadbalancer.BaseLoadBalancer</b>. You would
 * typically create custom implementation of this interface, if you
 * want your servers to be pinged in parallel. <b>Please note,
 * that implementations of this interface should be immutable.</b>
 *
 * 定义用于ping所有服务器的策略，毕竟一般来说单单ping某一台机器的意义并不大
 *
 * @author Dmitry_Cherkas
 * @see Server
 * @see IPing
 */
public interface IPingStrategy {

    boolean[] pingServers(IPing ping, Server[] servers);
}
