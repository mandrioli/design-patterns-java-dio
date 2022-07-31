package com.dio.gof;

import com.dio.gof.facade.Facade;
import com.dio.gof.singleton.SingletonEager;
import com.dio.gof.singleton.SingletonLazy;
import com.dio.gof.singleton.SingletonLazyHolder;
import com.dio.gof.strategy.Comportamento;
import com.dio.gof.strategy.ComportamentoAgressivo;
import com.dio.gof.strategy.ComportamentoDefensivo;
import com.dio.gof.strategy.ComportamentoNormal;
import com.dio.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		System.out.println();
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);		
		
		System.out.println();
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);		
		
		// Strategy
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();		
		robo.mover();
		robo.setComportamento(normal);
		robo.mover();	
		
		// Facade
		Facade facade = new Facade();
		facade.migrarCliente("João Ribeiro", "12345678");
	}

}
