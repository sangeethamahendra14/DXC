package Interface;

public class Mobile {
  private String name;
  private String brand;
  protected String operatingSystemName;
  private String operatingSystemVersion;
  
  public Mobile(String name, String brand, String operatingSystemName, String operatingSystemVersion) {
    this.name = name;
    this.brand = brand;
    this.operatingSystemName = operatingSystemName;
    this.operatingSystemVersion = operatingSystemVersion;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getBrand() {
    return brand;
  }
  
  public void setBrand(String brand) {
    this.brand = brand;
  }
  
  public String getOperatingSystemName() {
    return operatingSystemName;
  }
  
  public void setOperatingSystemName(String operatingSystemName) {
    this.operatingSystemName = operatingSystemName;
  }
  
  public String getOperatingSystemVersion() {
    return operatingSystemVersion;
  }
  
  public void setOperatingSystemVersion(String operatingSystemVersion) {
    this.operatingSystemVersion = operatingSystemVersion;
  }
}

class SmartPhone extends Mobile {
  private String networkGeneration;
  
  public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion, String networkGeneration) {
    super(name, brand, operatingSystemName, operatingSystemVersion);
    this.networkGeneration = networkGeneration;
  }
  
  public String getNetworkGeneration() {
    return networkGeneration;
  }
  
  public void setNetworkGeneration(String networkGeneration) {
    this.networkGeneration = networkGeneration;
  }
  
  public boolean testCompatibility() {
    if (operatingSystemName.equals("Android") && networkGeneration.equals("4G")) {
      return true;
    } else if (operatingSystemName.equals("iOS") && networkGeneration.equals("5G")) {
      return true;
    } else {
      return false;
    }
  }
}
