package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		
	
World world = new World();
Bug bug = new Bug();
Bug bug2 = new Bug();
Flower flower= new Flower();
bug2.setColor(Color.BLUE);
bug2.turn();
bug2.turn();
Location loc = new Location(3,5);
Location loc2=new Location(7,8);

world.show();
world.add(loc, bug);
world.add(loc2, bug2);

for(int i = 0; i<10;i++) {
	Location locF= new Location(0,i);
	world.add(locF, flower);
}
for(int i = 0; i<10;i++) {
	Location locF2= new Location(1,i);
	world.add(locF2, flower);
}
for(int i = 0; i<10;i++) {
	Location locF3= new Location(2,i);
	world.add(locF3, flower);
}
for(int i = 0; i<10;i++) {
	Location locF4= new Location(3,i);
	world.add(locF4, flower);
}
for(int i = 0; i<10;i++) {
	Location locF5= new Location(4,i);
	world.add(locF5, flower);
}

for(int i = 0; i<10;i++) {
	Location locF6= new Location(5,i);
	world.add(locF6, flower);
}
for(int i = 0; i<10;i++) {
	Location locF7= new Location(6,i);
	world.add(locF7, flower);
}

for(int i = 0; i<10;i++) {
	Location locF8= new Location(7,i);
	world.add(locF8, flower);
}
for(int i = 0; i<10;i++) {
	Location locF9= new Location(8,i);
	world.add(locF9, flower);
}
for(int i = 0; i<10;i++) {
	Location locF0= new Location(9,i);
	world.add(locF0, flower);
}

world.add(loc, bug);
world.add(loc2, bug2);
	
}
}


