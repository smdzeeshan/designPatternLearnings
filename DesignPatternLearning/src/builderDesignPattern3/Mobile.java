package builderDesignPattern3;

public class Mobile {
	private String name;
	private String color;
	private String processor;
	private String ram;
	
	private Mobile (MobileBuilder builder) {
		this.name = builder.name;
		this.color = builder.color;
		this.processor = builder.processor;
		this.ram = builder.ram;
	}
	
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public String getProcessor() {
		return processor;
	}
	public String getRam() {
		return ram;
	}
	
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", color=" + color + ", processor=" + processor + ", ram=" + ram + "]";
	}



	static class MobileBuilder {
		private String name;
		private String color;
		private String processor;
		private String ram;
		
		public Mobile build() {
			return new Mobile(this);
		}
		
		public MobileBuilder setName(String name) {
			this.name = name;
			return this;
		}
		
		public MobileBuilder setColor(String color) {
			this.color = color;
			return this;
		}
		public MobileBuilder setProcessor(String processor) {
			this.processor = processor;
			return this;
		}
		public MobileBuilder setRam(String ram) {
			this.ram = ram;
			return this;
		}
		
		
	}
}




