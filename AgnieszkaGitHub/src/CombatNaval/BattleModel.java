
package CombatNaval;

public class BattleModel {
    public enum State {
        CONFIGURING,
        PLAYING,
        DONE
    }
    
    private int size;
    
    FriendGrid friend;
    EnemiGrid enemi;

    public BattleModel(int size) {
        this.size = size;
    }

    public BattleModel(int size, FriendGrid friend, EnemiGrid enemi) {
        this.size = size;
        this.friend = friend;
        this.enemi = enemi;
    }


    
    
    
}
