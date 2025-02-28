public class MUDBuilderDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Dark Cavern")
                .addRoom(new Room("Entrance Hall"))
                .addRoom(new Room("Treasure Chamber"))
                .addNPC(new NPC("Goblin King"))
                .build();

        System.out.println(dungeon);
    }
}