package chapter11.modeldemo.pkgame;

/**
 * Assailable Interface
 * As long as implement this interface, it means it has the basic feature of
 * assailable attack object
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-11 17:04
 **/
public interface Assailable {
    /**
     * All the methods are abstract.
     * public abstract has been omitted.
     * @Param:
     * @Return:
    **/

    String getName();
    int getX();
    void setX(int x);
    int getHp();
    void setHp(int hp);
    /**
     * to see if can attack another object who has the ability of attack
     * according to distance
     * @Param:
     * @Return:
    **/

    boolean isFightByDistance(Assailable assa);


}
