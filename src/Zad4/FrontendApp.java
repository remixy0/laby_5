package Zad4;

public class FrontendApp implements Deployable {
    @Override
    public void deploy() {
        System.out.println("Deploying FrontendApp");
    }
}


class BackendService implements Deployable{
    @Override
    public void deploy() {
        System.out.println("Deploying BackendService");
    }

}

class DeploymentManager{
    public static void runDeployment(Deployable deploy){
        deploy.deploy();
    }
}