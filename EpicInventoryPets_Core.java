package epicinventorypets.dinobossyt.dev;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;

import dinolib.dinobossyt.fosil.core.utilidades.ColorVariable;

public class EpicInventoryPets_Core {
	private PluginDescriptionFile pdf = getDescription();
	  public String rutaConfig;
	  public String prefix = ChatColor.translateAlternateColorCodes('&', "&7[&5EPIC&dINVENTORY&bPETS&7] ");
	  public String V = pdf.getVersion();

	public void onEnable() {
		  Bukkit.getConsoleSender().sendMessage("");
		  Bukkit.getConsoleSender().sendMessage(this.prefix+ColorVariable.translate("Creador:"+V));
		  Bukkit.getConsoleSender().sendMessage(this.prefix+ColorVariable.translate("Plugin activado con exito!!"));
		  Bukkit.getConsoleSender().sendMessage(this.prefix+ColorVariable.translate("Te agradezco por usar este plugin"));
		  Bukkit.getConsoleSender().sendMessage("");
		
		
		
	}
	public void onDisable() {
		
		
		
	}
}