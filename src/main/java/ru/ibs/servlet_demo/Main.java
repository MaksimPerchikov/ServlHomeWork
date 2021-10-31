package ru.ibs.servlet_demo;
import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.server.Server;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Start main class");
        Server server = new Server(8080);
        final String webAppPath = Main.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        WebAppContext webAppContext = new WebAppContext(webAppPath,"/");
        server.setHandler(webAppContext);

        server.start();
        System.out.println("Ok:server started");
    }
}
