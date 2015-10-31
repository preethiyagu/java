
public class Country {
	
	
		private String name;
		public Country(String name){
			this.name= name ;
		}

		/*public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}*/
		@Override
		public boolean equals(Object o){
			Country c = (Country)o;
			if(name.equals(c.name))
			return true;
			else
			return false;	
			
		}
	@Override
	 public int hashCode(){
		 System.out.println("hashcode"+name.hashCode());
		 return name.hashCode();
	 }

}
