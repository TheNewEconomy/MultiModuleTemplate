package net.tnemc.module.template;
/*
 * The New Economy
 * Copyright (C) 2022 - 2024 Daniel "creatorfromhell" Vidmar
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import net.tnemc.menu.core.MenuHandler;
import net.tnemc.plugincore.PluginCore;
import net.tnemc.plugincore.core.io.storage.StorageManager;
import net.tnemc.plugincore.core.module.Module;
import net.tnemc.plugincore.core.module.ModuleInfo;
import revxrsal.commands.CommandHandler;
import revxrsal.commands.orphan.OrphanCommand;

import java.io.File;
import java.util.List;

/**
 * TemplateModule
 *
 * @author creatorfromhell
 * @since 1.0.0.0
 */
@ModuleInfo(
       name = "Template",
       author = "creatorfromhell",
       version = "1.0.0.0"
)
public class TemplateModule implements Module {

  @Override
  public void enable(PluginCore pluginCore) {
    PluginCore.log().inform("TemplateModule enabled");
  }

  @Override
  public void disable(PluginCore pluginCore) {
    PluginCore.log().inform("TemplateModule disabled");
  }

  @Override
  public void initConfigurations(File file) {

  }

  @Override
  public void backup(StorageManager storageManager) {

  }

  @Override
  public void reset(StorageManager storageManager) {

  }

  @Override
  public void enableSave(StorageManager storageManager) {

  }

  @Override
  public void enableMenu(MenuHandler menuHandler) {

  }

  @Override
  public void registerCommands(CommandHandler commandHandler) {

  }

  @Override
  public List<OrphanCommand> registerMoneySub() {
    return List.of();
  }

  @Override
  public List<OrphanCommand> registerTransactionSub() {
    return List.of();
  }

  @Override
  public List<OrphanCommand> registerAdminSub() {
    return List.of();
  }
}
