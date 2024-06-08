public interface WirelessConnection {
    
    public void connect(String networkName, String password);
    public void disconnect();
    public boolean isConnected();

}