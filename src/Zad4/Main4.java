package Zad4;

public class Main4 {
    public static void main(String[] args) {
        FrontendApp app = new FrontendApp();
        DeploymentManager.runDeployment(app);

        BackendService app2 = new BackendService();
        DeploymentManager.runDeployment(app2);

    }
}
