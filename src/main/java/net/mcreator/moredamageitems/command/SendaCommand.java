
package net.mcreator.moredamageitems.command;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;

import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import com.mojang.brigadier.arguments.StringArgumentType;

@Mod.EventBusSubscriber
public class SendaCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("senda")

				.then(Commands.argument("player", EntityArgument.player()).then(Commands.argument("message", StringArgumentType.string()))));
	}
}
