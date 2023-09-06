package com.keduit.controller;

import com.keduit.controller.action.Action;
import com.keduit.controller.action.BoardCheckPassAction;
import com.keduit.controller.action.BoardCheckPassFormAction;
import com.keduit.controller.action.BoardDeleteAction;
import com.keduit.controller.action.BoardListAction;
import com.keduit.controller.action.BoardUpdateAction;
import com.keduit.controller.action.BoardUpdateFormAction;
import com.keduit.controller.action.BoardViewAction;
import com.keduit.controller.action.BoardWriteAction;
import com.keduit.controller.action.BoardWriteFormAction;

public class ActionFactory {

	private ActionFactory() {
	}

	private static ActionFactory instance = new ActionFactory();

	public static ActionFactory getInstance() {
		return instance;
	}

	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory : " + command);

		if (command.equals("board_list")) {
			action = new BoardListAction();
		}
		else if (command.equals("board_write_form")) {
			action = new BoardWriteFormAction();
		}
		else if (command.equals("board_write")) {
			action = new BoardWriteAction();
		}
		else if (command.equals("board_view")) {
			action = new BoardViewAction();
		}
		else if (command.equals("board_check_pass_form")) {
			action = new BoardCheckPassFormAction();
		}
		else if (command.equals("board_check_pass")) {
			action = new BoardCheckPassAction();
		}
		else if (command.equals("board_delete")) {
			action = new BoardDeleteAction();
		}
		else if (command.equals("board_update_form")) {
			action = new BoardUpdateFormAction();
		}
		else if (command.equals("board_update")) {
			action = new BoardUpdateAction();
		}
		return action;
	}
}
