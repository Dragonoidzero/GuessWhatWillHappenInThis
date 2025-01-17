package fr.anatom3000.gwwhit.block;

import fr.anatom3000.gwwhit.registry.BlockEntityRegistry;
import fr.anatom3000.gwwhit.registry.BlockRegistry;
import fr.anatom3000.gwwhit.util.MathUtil;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.Tickable;
import net.minecraft.util.math.BlockPos;

public class InfectedMassBlockEntity extends BlockEntity implements Tickable {

    private int timer = -1;

    public InfectedMassBlockEntity() {
        super(BlockEntityRegistry.INFECTED_MASS_BLOCK_ENTITY);
    }

    @Override
    public void tick() {
        timer = (timer + 1) % 20;
        if (timer != 0) {
            return;
        }
        if (MathUtil.getChance(75F)) {
            return;
        }
        BlockPos newPos;
        BlockState state;

        newPos = new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ());
        state = world.getBlockState(newPos);
        if (MathUtil.getChance(20F) && !state.isAir() && state.getBlock() != BlockRegistry.get("infected_mass")) {
            world.setBlockState(newPos, this.getCachedState());
        }

        newPos = new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ());
        state = world.getBlockState(newPos);
        if (MathUtil.getChance(20F) && !state.isAir() && state.getBlock() != BlockRegistry.get("infected_mass")) {
            world.setBlockState(newPos, this.getCachedState());
        }

        newPos = new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ());
        state = world.getBlockState(newPos);
        if (MathUtil.getChance(20F) && !state.isAir() && state.getBlock() != BlockRegistry.get("infected_mass")) {
            world.setBlockState(newPos, this.getCachedState());
        }

        newPos = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ());
        state = world.getBlockState(newPos);
        if (MathUtil.getChance(20F) && !state.isAir() && state.getBlock() != BlockRegistry.get("infected_mass")) {
            world.setBlockState(newPos, this.getCachedState());
        }

        newPos = new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1);
        state = world.getBlockState(newPos);
        if (MathUtil.getChance(20F) && !state.isAir() && state.getBlock() != BlockRegistry.get("infected_mass")) {
            world.setBlockState(newPos, this.getCachedState());
        }

        newPos = new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1);
        state = world.getBlockState(newPos);
        if (MathUtil.getChance(20F) && !state.isAir() && state.getBlock() != BlockRegistry.get("infected_mass")) {
            world.setBlockState(newPos, this.getCachedState());
        }
    }

}
