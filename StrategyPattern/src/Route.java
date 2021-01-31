
public class Route {
	
	private Routing routing = new CarRouting();
	
	public void createRoute() {
		routing.createRoute();
	}
	
	public void setRouting(Routing routing) {
		this.routing = routing;
	}
	
	public Routing getRouting() {
		return routing;
	}
}
