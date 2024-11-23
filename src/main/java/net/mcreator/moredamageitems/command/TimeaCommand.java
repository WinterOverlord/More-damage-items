
package net.mcreator.moredamageitems.command;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;

import net.minecraft.commands.Commands;

import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class TimeaCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("timea")

				.then(Commands.literal("add").then(Commands.argument("time", DoubleArgumentType.doubleArg(0))))
				.then(Commands.literal("set").then(Commands.literal("day")).then(Commands.literal("noon")).then(Commands.literal("night")).then(Commands.literal("midnight"))));
	}
}
