package com.teambr.projectdn.commands;

import com.teambr.projectdn.collections.WorldStructure;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

/**
 * This file was created for ProjectDN
 * <p>
 * ProjectDN is licensed under the
 * Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * @author Paul Davis <pauljoda>
 * @since 8/4/2016
 */
public class DebugAlter extends CommandBase {
    @Override
    public String getCommandName() {
        return "debugAlter";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "Debug for alter";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        EntityPlayer player = (EntityPlayer) sender.getCommandSenderEntity();
        World world = server.getEntityWorld();

        BlockPos center = player.getPosition();

        player.addChatMessage(new TextComponentString(WorldStructure.getAlterType(world, center).toString()));
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 3;
    }
}
