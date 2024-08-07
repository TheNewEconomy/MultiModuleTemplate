package net.tnemc.module.bukkit.template;
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

import net.tnemc.module.core.template.TemplateCoreModule;
import net.tnemc.plugincore.core.module.ModuleInfo;
import revxrsal.commands.CommandHandler;
import revxrsal.commands.orphan.OrphanCommand;

import java.util.List;

/**
 * TemplateModule
 *
 * @author creatorfromhell
 * @since 1.0.0.0
 */
@ModuleInfo(
       name = "TemplateBukkit",
       author = "creatorfromhell",
       version = "1.0.0.0"
)
public class TemplateBukkitModule extends TemplateCoreModule {

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
