package io.arukas.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.PingUrl;

public class HelloMessageRibbonConfiguration {

	public IPing ribbonPing(IClientConfig config){
		return new PingUrl();
	}
	
}
