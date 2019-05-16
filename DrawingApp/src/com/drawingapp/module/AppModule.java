package com.drawingapp.module;

import com.drawingapp.annotations.Circle;
import com.drawingapp.annotations.ColorValue;
import com.drawingapp.annotations.EdgeSize;
import com.drawingapp.annotations.Square;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;


public class AppModule extends AbstractModule{
	
	@Override
	protected void configure() {
		//bind(DrawShape.class).to(DrawSquare.class);		
		bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
		bind(Integer.class).annotatedWith(EdgeSize.class).toInstance(40);
	}
	
	@Provides	
	@Singleton
	DrawShape providesDrawSquare(@ColorValue String color, @EdgeSize Integer edge){
		DrawShape d = new DrawSquare(color, edge);
		return d;
	}
	
	
}
