package ru.rpgc.file;

import org.bukkit.Bukkit;
import ru.rpgc.debug.constant.Messages;
import ru.rpgc.setting.Setting;

import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * Created by bigtows on 01/07/2017.
 */
public class CustomConfig {
    private Path pathConfig;

    public CustomConfig() {
        pathConfig = FileSystems.getDefault().getPath("plugin/" + Setting.NAME_CONFIG_FOLDER, "config.yml");
    }
}
