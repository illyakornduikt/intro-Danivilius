package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_boots extends SuperObject{
    public OBJ_boots(){
        name = "Boots";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/boots.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
