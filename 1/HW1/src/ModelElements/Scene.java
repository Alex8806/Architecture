package ModelElements;

import java.util.List;

public class Scene {
    public int ID;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    public Scene(int ID, List<PoligonalModel> models,
                 List<Flash> flashes,
                 List<Camera> cameras)
            throws Exception {
        if (models.size() > 0) {
            Models = models;
        } else throw new Exception("Models size exception");
        if (cameras.size() > 0) {
            Cameras = cameras;
        } else throw new Exception("Cameras size exception");

        this.ID = ID;

        Flashes = flashes;
    }
}
