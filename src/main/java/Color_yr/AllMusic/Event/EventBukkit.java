package Color_yr.AllMusic.Event;

import Color_yr.AllMusic.AllMusic;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class EventBukkit implements Listener {
    @EventHandler
    public void onPlayerQuit(final PlayerQuitEvent e) {
        AllMusic.removeNowPlayPlayer(e.getPlayer().getName());
    }
}
