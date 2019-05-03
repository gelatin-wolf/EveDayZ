package io.github.geletinwolf.items;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Arrays;
import java.util.List;

public class ItemBandage extends ItemBase{
    @Override
    public Material getType() {
        return Material.PAPER;
    }

    @Override
    public String getName() {
        return "붕대";
    }

    @Override
    public List<String> getDescription() {
        return Arrays.asList(new String[]{
                "우클릭을 하면 출혈이 멈춥니다."
        });
    }

    @Override
    public Runnable getFunctionality(PlayerInteractEvent event) {
        return new Runnable() {
            @Override
            public void run() {
                Player eun = event.getPlayer();
                eun.sendMessage("출혈이 멈췄습니다.");
            }
        };
    }
}
