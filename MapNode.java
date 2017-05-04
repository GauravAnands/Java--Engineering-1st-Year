package roadgraph;


import java.util.HashSet;

import java.util.Set;

import java.util.stream.Collectors;


import geography.GeographicPoint;



public class MapNode {
	
     private HashSet<Road> roads;
	
    private GeographicPoint position;
	
	
    public MapNode(GeographicPoint position) {
	
                 this.roads = new HashSet<>();
		
                 this.position = position;
	
       }
	
	
public HashSet<Road> getRoads() {
	
	return roads;
            }

	
public GeographicPoint getPosition() {
		
                 return position;
            }

	
public void setPosition(GeographicPoint position) {
	
	this.position = position;

	}
	
	
public void addRoad(Road road) {
		
                this.roads.add(road);
	
                }
	
	
/*
	 * Return all neighbors this node is related to
	 */
	
public Set<MapNode> getNeighbors() {
		
return roads.stream().map((road) -> road.getTo()).collect(Collectors.toSet());
	
               }

}
