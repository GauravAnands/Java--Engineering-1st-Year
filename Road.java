package roadgraph;


public class Road {

	private String roadType;

	private double distance;

	private String name;

	private MapNode from;

	private MapNode to;

	
public Road() {

		this.roadType = "";

		this.distance = 0.0;

		this.name = "";
	}

	
public Road(String roadName, String roadType, double distance, MapNode from, MapNode to) {

		this.roadType = roadType;

		this.distance = distance;
	
	                   this.name = roadName;

		this.from = from;

		this.to = to;
	
                                   }

	
public MapNode getFrom() {

		return from;
	}

	
                  public void setFrom(MapNode from) {

		this.from = from;
	}


	public MapNode getTo() {
		return to;
	}


	public void setTo(MapNode to) {

		this.to = to;
	}


	public String getRoadType() {

		return roadType;
	}

	
public void setRoadType(String roadType) {

		this.roadType = roadType;
	}

	public double getDistance() {

		return distance;
	}

	public void setDistance(int distance) {

		this.distance = distance;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	
                      }

}
