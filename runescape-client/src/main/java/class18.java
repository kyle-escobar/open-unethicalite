import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
class class18 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lj;"
	)
	final class10 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lj;)V"
	)
	class18(class10 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "-1228298901"
	)
	int method276(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method276((Entry)var1, (Entry)var2);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "8396800"
	)
	protected static final void method282() {
		class13.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		WorldMapCacheName.gameCyclesToDo = 0;
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1228311382"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (FloorOverlayDefinition.loadInterface(var0)) {
			GameBuild.runComponentCloseListeners(Calendar.Widget_interfaceComponents[var0], var1);
		}
	}
}
