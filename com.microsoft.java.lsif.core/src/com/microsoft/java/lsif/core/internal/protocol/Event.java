/* --------------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * ------------------------------------------------------------------------------------------ */


package com.microsoft.java.lsif.core.internal.protocol;

public class Event extends Vertex {

	private String kind;

	private String scope;

	private String data;

	public Event(String id, String scope, String kind, String data) {
		super(id, Vertex.EVENT);
		this.scope = scope;
		this.kind = kind;
		this.data = data;
	}

	public String getScope() {
		return scope;
	}

	public String getKind() {
		return kind;
	}

	public String getData() {
		return data;
	}

	public static class EventScope {
		public static final String Group = "group";
		public static final String Project = "project";
		public static final String DOCUMENT = "document";
	}

	public static class EventKind {
		public static final String BEGIN = "begin";
		public static final String END = "end";
	}
}
