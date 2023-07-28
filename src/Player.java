public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
        if(healthPercentage<0){
            this.healthPercentage = 0;
        } else if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage){
        if(damage >= healthPercentage){
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of game");
        } else {
            healthPercentage -= damage;
        }
    }
    public void restoreHealth(int healthPotion){
        if(healthPotion >= 100-healthPercentage){
            healthPercentage = 100;
        } else {
            healthPercentage += healthPotion;
        }
    }

}
