package things;
public class RoomObject{
	private String name;
	public RoomObject(String name){
		this.name=name;
	}
	
	@Override
	public String toString(){
		return name;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof String){
			return obj.equals(name);
		}
		return super.equals(obj);
	}
}//end class
