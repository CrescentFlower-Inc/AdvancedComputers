package ml.codersquack.ac.core.init;

import ml.codersquack.ac.AdvancedComputers;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.ForgeRegistries;


public class BlockInit {
  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AdvancedComputers.MOD_ID);

  public static final RegistryObject<Block> Storage_Specializer = BLOCKS.register("block", () -> new Block(AbstractBlock.Properties.of(Material.METAL)));
}