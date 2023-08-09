	public static void agregarTe() {
		JFrame frame = new JFrame("Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		JLabel label = new JLabel("Ingrese la cantidad de campos de texto:");
		JTextField textField = new JTextField(20);
		JButton button = new JButton("Crear");

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = Integer.parseInt(textField.getText());
				panel.removeAll();
				panel.add(label);
				panel.add(textField);
				for (int i = 0; i < count; i++) {
					panel.add(new JTextField(20));
				}
				panel.add(button);
				panel.revalidate();
				panel.repaint();
			}
		});
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}