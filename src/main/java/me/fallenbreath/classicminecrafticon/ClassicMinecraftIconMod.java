/*
 * This file is part of the Classic Minecraft Icon project, licensed under the
 * GNU Lesser General Public License v3.0
 *
 * Copyright (C) 2023  Fallen_Breath and contributors
 *
 * Classic Minecraft Icon is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Classic Minecraft Icon is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Classic Minecraft Icon.  If not, see <https://www.gnu.org/licenses/>.
 */

package me.fallenbreath.classicminecrafticon;

//#if FORGE
//$$ @net.minecraftforge.fml.common.Mod("classic-minecraft-icon")
//#endif
public class ClassicMinecraftIconMod
		//#if FABRIC
		implements net.fabricmc.api.ModInitializer
		//#endif
{
	//#if FABRIC
	@Override public void onInitialize()
	//#elseif FORGE
	//$$ public ClassicMinecraftIconMod()
	//#endif
	{
		ClassicMinecraftIconStorage.init();
	}
}
