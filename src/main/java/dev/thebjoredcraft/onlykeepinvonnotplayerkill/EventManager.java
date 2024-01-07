package dev.thebjoredcraft.onlykeepinvonnotplayerkill;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class EventManager implements Listener {
    @EventHandler
    public void onDeath(PlayerDeathEvent event){
        if(event.getEntity().getKiller() == null){//Natural Death
            event.setKeepInventory(true);
            event.setKeepLevel(true);
            event.setDroppedExp(0);
            event.getDrops().clear();

        }else{//Player kill
            event.setKeepInventory(false);
            event.setKeepLevel(false);
        }
    }
}
