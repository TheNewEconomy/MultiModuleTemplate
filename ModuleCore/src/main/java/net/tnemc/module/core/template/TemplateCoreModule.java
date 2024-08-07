package net.tnemc.module.core.template;
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

import java.io.File;

/**
 * TemplateModule
 *
 * @author creatorfromhell
 * @since 1.0.0.0
 */
public abstract  class TemplateCoreModule implements Module {

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
}
