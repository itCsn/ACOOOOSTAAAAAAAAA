package com.pe.uni.fiis.modprueba.item.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;

import com.google.common.collect.ImmutableMap;


//esto es un ejemplo de como deberia hacerse un item custom
public class Notebook extends Item{
    private static final Map<Block, Item> BLOW_TORCH_ITEM_CRAFT = new ImmutableMap.Builder<Block, Item>()
     .put(Blocks.DIRT, Items.GOLDEN_APPLE.asItem()).build();

    public Notebook(Properties notebookPropiedades) {
        super(notebookPropiedades);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if(!context.getLevel().isClientSide()){
            
            Level level = context.getLevel();
            BlockPos blockPosition = context.getClickedPos();
            Block blockClicked = level.getBlockState(blockPosition).getBlock();

            if(canUse(blockClicked)){
                ItemEntity item = new ItemEntity(level, 
                    blockPosition.getX(), blockPosition.getY(), blockPosition.getZ(), 
                    new ItemStack(BLOW_TORCH_ITEM_CRAFT.get(blockClicked),1));
            
            
                    level.destroyBlock(blockPosition, false);
                    level.addFreshEntity(item);
                    
            }
            
            
        }
        return InteractionResult.SUCCESS;
    }

    private boolean canUse(Block block){
        return BLOW_TORCH_ITEM_CRAFT.containsKey(block);
    }
}
