package ml.codersquack.ac.core.init;

import ml.codersquack.ac.AdvancedComputers;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.block.Block;
import net.minecraftforge.registries.ForgeRegistries;


public class BlockInit {
  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AdvancedComputers.MOD_ID);
}