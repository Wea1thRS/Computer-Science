/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextAdventure;

/**
 *
 * @author Ethan
 */
public class TextAdventure {

    public static void main(String[] args) {
        Player player = new Player("You", "A nerd with now broken glasses.");

        Room lab = new Room("Lab", "It's filled with advanced technology... Bunches of panels and lights, "
                + "you can hear lots of bleeps, sweeps, and the creeps. You see equipment laying on the nearby table.");
        Room corridor = new Room("Corridor", "It's a long hallway that doesn't seem to end with a few doors and windows."
                + "through the windows you see lots of stars and darkness.");
        Room bathroom = new Room("Bathroom", "It's a strange bathroom, not like any one you would normally see.\n"
                + "Something left a article of clothing behind and you see a blue ribbon sticking out of the pocket.");
        Room lounge = new Room("Lounge", "It's a large open area full of gadgets and toys. Inside you see what look to be an alien. You don't think you can sneak past the alien without disturbing him, which is likely not a good idea.");
        Room stairwell = new Room("Stairwell", "A large stairwell leading down.");
        Room basement = new Room("Basement", "Dark, cold, and loud.");
        Room controlroom = new Room("Control Room", "It's filled with controls and machines. Has a hole in the floor in the corner of the room.");
        Room pipe = new Room("Pipe", "It's a pipe filled with wires and other alien tech. At the end of it you find a fairy who says, \"Wrong way! Turn back now!\"");
        Room tunnel = new Room("Tunnel", "A tunnel that just goes on and on and on at a slight angle, as if it was going in a gigantic circle.");
        Room teleporterroom = new Room("Teleporter Room", "The teleporter room!");
        Room teleporter = new Room("The teleporter.", "You made it!");
        Room end = new Room("The end", "Thanks for playing");

        Item scalpel = new Item("Scalpel", "Small and extremely sharp.");
        Item keycard = new Item("Key Card", "Key Card with a blue ribbon.");
        Item teleportkey = new Item("Teleportation Key", "A what-looks-to-be USB stick with a \"Teleport key\" label.");
        Item aliengun = new Item("Alien Gun", "A gun made by aliens.");

        Creature alien = new Creature("Alien", "Slightly resembling humans shape-wise, black skin with purple spines, emits an ominous glow. Distracted by some device on the oppsoite wall.", "You sneak up behind the alien and slice it's neck, yellow slime seeping from it's skin and dripping off it's spines.", scalpel);
        Creature fairy = new Creature("Fairy", "Short and slim with deep yellow eyes glowing brightly.", "", null);
        Creature aliendog = new Creature("A... dog?", "A pink dog-like creature with 8 eyes.", "You try and shoot it in the face with your alien gun but you miss and it hits his tail and he runs away.", aliengun);

        Exit toLab = new Exit("Hatchway", "A fancy doorway that leads to a lab", "You make your way back into the lab", lab, null, false);
        Exit toCorridor = new Exit("Hatchway", "A fancy doorway that leads to a hallway.", "You cautiously make your way into the corridor.", corridor, null, false);
        Exit toBathroom = new Exit("Door", "A normal door that leads to a bathroom.", "You slide into the bathroom with what you hope is the gender neutral sign.", bathroom, null, false);
        Exit fromBathroom = new Exit("Door", "The way back from where you came.", "You return to the corrdidor", corridor, null, false);
        Exit toLounge = new Exit("Opening", "An opening to the lounge.", "You walk through.", lounge, null, false);
        Exit fromLounge = new Exit("Opening", "An opening to the corridor.", "You walk through.", corridor, null, false);
        Exit toStairwell = new Exit("Stairs", "A stairwell that leads down to a dark abyss.", "You start down the stairs", stairwell, null, true);
        Exit toBasement = new Exit("Basement", "The stairwell led here.", "You leave the stairwell and walk into the basement.", basement, null, false);
        Exit toControlRoom = new Exit("Locked Door", "A door! But it looks to be locked. It has a card reader next to it, with a blue outline.", "You slide the card and walk through.", controlroom, keycard, true);
        Exit aperture = new Exit("Hole", "A hole in the floor that looks to lead to a pipe, just big enough for someone to squeeze through.", "You squeeze into the hole in the floor.", pipe, null, false);
        Exit fromControlRoom = new Exit("Unlocked Door", "A door! It looks to be unlocked!", "You leave through the door", basement, null, false);
        Exit fromAperture = new Exit("Hole", "A hole in the floor that leads out of the pipe", "You squeeze back through the hole", controlroom, null, false);
        Exit toTeleporterRoom = new Exit("Door", "A door that leads to the exit.", "You quickly enter through the door", teleporterroom, teleportkey, true);
        Exit toTunnel = new Exit("Outlet", "A path that leads to a tunnel", "You enter the tunnel.", tunnel, null, false);
        Exit fromTunnel = new Exit("Outlet", "A path that leads to the basement", "You exit the tunnel.", basement, null, false);
        Exit fromTeleporterRoom = new Exit("Door", "A door that leads out of the exit, not sure why you would want to do that!", "You have a death wish.", tunnel, null, false);
        Exit toTeleporter = new Exit("Teleporter", "A fancy teleportation device", "You teleport out.", end, teleportkey, true);

        lab.setItem(scalpel);
        bathroom.setItem(keycard);
        controlroom.setItem(teleportkey);
        teleporterroom.setItem(aliengun);

        lounge.setCreature(alien);
        pipe.setCreature(fairy);
        teleporterroom.setCreature(aliendog);

        lab.setExit1(toCorridor);
        corridor.setExit1(toBathroom);
        corridor.setExit2(toLounge);
        corridor.setExit3(toLab);
        bathroom.setExit1(fromBathroom);
        lounge.setExit1(toStairwell);
        lounge.setExit2(fromLounge);
        stairwell.setExit1(toBasement);
        stairwell.setExit2(toLounge);
        basement.setExit1(toControlRoom);
        basement.setExit2(toStairwell);
        controlroom.setExit1(fromControlRoom);
        controlroom.setSecretExit(aperture);
        pipe.setExit1(fromAperture);
        basement.setExit3(toTunnel);
        tunnel.setExit1(fromTunnel);
        tunnel.setExit2(toTeleporterRoom);
        teleporterroom.setExit1(fromTeleporterRoom);
        teleporterroom.setExit2(toTeleporter);

        World world = new World(lab, end);
        Game adventureGame = new Game(world, player);
        adventureGame.setStartText("You wake up in an unknown location. You look around curious, but terrified. "
                + "\nYou feel nauseous and uneasy.");
        adventureGame.setVictoryText("You escaped!.");
        adventureGame.start();
    }
}
