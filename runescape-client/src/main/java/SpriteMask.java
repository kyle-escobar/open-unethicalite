import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1799242845
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1101967101
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("f")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("n")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-763774410"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) {
			int var3 = this.xStarts[var2];
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Llv;Ljava/lang/String;Ljava/lang/String;I)[Lqu;",
		garbageValue = "335525646"
	)
	public static IndexedSprite[] method5693(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		return class390.method7253(var0, var3, var4);
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2028247569"
	)
	static void method5688() {
		if (Varcs.field1323 != null) {
			Client.field782 = Client.cycle;
			Varcs.field1323.method6207();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					Varcs.field1323.method6201(class128.baseX * 64 + (Client.players[var0].x >> 7), WorldMapData_1.baseY * 64 + (Client.players[var0].y >> 7));
				}
			}
		}

	}
}
