/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.mopp;

public class IpcTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public org.kardo.language.ipc.resource.ipc.IIpcTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("instance pointcut".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0xFF, 0x00, 0xAA}, null, true, false, false, false);
		}
		if ("composite instance pointcut".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0xFF, 0x00, 0xAA}, null, true, false, false, false);
		}
		if ("UNTIL".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0xFF, 0x00, 0xAA}, null, true, false, false, false);
		}
		if ("afterevent".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0xFF, 0x55, 0xAA}, null, true, false, false, false);
		}
		if ("beforeevent".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0xFF, 0x55, 0xAA}, null, true, false, false, false);
		}
		if ("inter".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0xFF, 0x55, 0xAA}, null, true, false, false, false);
		}
		if ("union".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0xFF, 0x55, 0xAA}, null, true, false, false, false);
		}
		if ("aspect".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0xFF, 0x00, 0x11}, null, true, false, false, false);
		}
		if ("pointcut".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0xFF, 0x00, 0x11}, null, true, false, false, false);
		}
		if ("call".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0xFF, 0x00, 0x11}, null, true, false, false, false);
		}
		if ("this".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0xFF, 0x00, 0x11}, null, true, false, false, false);
		}
		if ("returning".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0xFF, 0x00, 0x11}, null, true, false, false, false);
		}
		if ("args".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0xFF, 0x00, 0x11}, null, true, false, false, false);
		}
		if ("target".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0xFF, 0x00, 0x11}, null, true, false, false, false);
		}
		if ("within".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0xFF, 0x00, 0x11}, null, true, false, false, false);
		}
		if ("if".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0xFF, 0x00, 0x11}, null, true, false, false, false);
		}
		if ("after".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0xFF, 0x00, 0x11}, null, true, false, false, false);
		}
		if ("before".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0xFF, 0x00, 0x11}, null, true, false, false, false);
		}
		if ("->".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x00, 0x00, 0x00}, null, true, false, false, false);
		}
		if ("ML_COMMENT".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x00, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("SL_COMMENT".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x00, 0x00, 0x80}, null, false, true, false, false);
		}
		if ("STRING_LITERAL".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("IDENTIFIER".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x00, 0x00, 0x00}, null, false, false, false, false);
		}
		if ("abstract".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("assert".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("boolean".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("byte".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("case".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("catch".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("class".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("continue".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("char".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("default".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("double".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("do".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("enum".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("extends".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("else".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("for".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("float".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("final".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("import".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("implements".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("int".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("interface".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("instanceof".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("package".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("private".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("protected".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("public".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("super".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("switch".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("strictfp".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("static".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("synchronized".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("try".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("throws".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("transient".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("new".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("null".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("while".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("void".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("long".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("return".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("finally".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("throw".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("break".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("native".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("volatile".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("short".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		if ("privileged".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("execution".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("get".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("set".equals(tokenName)) {
			return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		return null;
	}
	
}
